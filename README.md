
# WARNING: work in progress

Use this repository at your own risk. This is a work in progress. For official ROS2
yocto layers, refer to this repository: https://github.com/ros/meta-ros

# meta-ros2 generator

This repository contains a script to generate bitbake recipes for ROS2. It
does so by using a package list from here: https://github.com/ros/rosdistro/blob/master/dashing/distribution.yaml

Next, the script will download the zipfile, extract the meta-data and
generate bitbake recipes.

ATTENTION! This is pretty much non-tested, for proper support, please visit: https://github.com/ros/meta-ros

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

