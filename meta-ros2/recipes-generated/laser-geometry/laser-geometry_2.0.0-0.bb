
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package contains a class for converting from a 2D laser scan as defined by sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud or sensor_msgs/PointCloud2. In particular, it contains functionality to account for the skew resulting from moving robots or tilting laser scanners. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "eigen rclcpp sensor-msgs tf2"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-cmake eigen rclcpp sensor-msgs tf2"
ROS_TEST_DEPENDS = "ament-cmake-cppcheck ament-cmake-cpplint ament-cmake-gmock ament-cmake-gtest ament-cmake-lint-cmake ament-cmake-uncrustify"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/laser_geometry-release/archive/release/dashing/laser_geometry/2.0.0-0.zip;downloadfilename=laser-geometry_2.0.0-0.zip"
SRC_URI[md5sum] = "197e85484c1ee65112a1ed442368b6cb"
SRC_URI[sha256sum] = "31b57e82079aec54ab29f42a6a890e208627d6aeae87259687724d627ef47686"

S = "${WORKDIR}/laser_geometry-release-release-dashing-laser_geometry-2.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

