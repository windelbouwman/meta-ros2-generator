
# WARNING: work in progress

Use this repository at your own risk. This is a work in progress. For official ROS2
yocto layers, refer to [this repository](https://github.com/ros/meta-ros)

# meta-ros2 generator

This repository contains a script to generate bitbake recipes for ROS2. It
does so by using a package list [from here](https://github.com/ros/rosdistro/blob/master/dashing/distribution.yaml)

Next, the script will download the zipfile, extract the meta-data and
generate bitbake recipes.

# Usage

     $ mkdir git
     $ git clone https://github.com/ros/rosdistro.git
     $ git clone https://github.com/windelbouwman/meta-ros2-generator.git
     $ cd meta-ros2-generator
     $ python make_meta_ros.py ../rosdistro/dashing/distribution.yaml meta-ros2/recipes-generated

Now, to use this, include the meta-ros2 layer in your build, and build rclpy for example:

     $ bitbake rclpy

# Directories

- meta-ros2 : ros2 meta layer for yocto
- meta-ros2/recipes-generated : folder filled with data from the script in this repo.
- meta-ros2/recipes-manual/dependency-patches : a folder with patches to yocto recipes to satisfy ros2 dependencies on non-ros2 packages
- meta-ros2/recipes-manual/python-packages : some python packages which are pretty new.
- meta-ros2/recipes-manual/ros2-patches : specific ros2 recipe patches. This folder would ideally be empty.

# Design

To build ROS2 upon yocto/openembedded, we take the distribution file of ROS2, which is a YAML file
with a list of target packages and versions. This distribution file describes a certain ROS2 distribution.
Each package and version points to an URL where the ROS package is located. This package is then
downloaded, and its meta data is inspected.

The meta data of each ROS2 package contains information about the build-tool, and the dependencies
of the package.

The build-tool is most of the cases ament-cmake, cmake or ament-python. ROS uses a custom
build system on top of cmake, called ament. For this build type, we create a bbclass for
the openembedded build system.

For each ROS package, we create a bitbake recipe automatically. Not all generated recipes
work out of the box as expected, so for these cases, we create some extra additions to
the recipe in the form of a .bbappend file. These bbappend files modify the automatically
generated recipes so that they are compilable.

Notable issues:

- poco-vendor and yaml-vendor. These libraries are a wrapper around the poco and yaml
  libraries. The strategy for these libraries is to prevent their usage, and modify
  the recipes which include them, to not include those libraries, but the original
  yaml and poco libraries instead.

- ament-cmake: this package requires itself as build system. This means that ament-cmake
  is build using ament-cmake. This results in a circular dependency. To solve this, we
  build ament-cmake with cmake. This works.


