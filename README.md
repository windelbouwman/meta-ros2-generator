
# meta-ros2 generator

This repository contains a script to generate bitbake recipes for ROS2. It
does so by using a package list from here: https://github.com/ros/rosdistro/blob/master/dashing/distribution.yaml

Next, the script will download the zipfile, extract the meta-data and
generate bitbake recipes.

# Usage

     $ mkdir recipes
     $ python make_meta_ros.py dashing/distribution.yaml recipes

Now, to use this, copy the recipes into a yocto layer and include in your build.
