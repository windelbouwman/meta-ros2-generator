
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " Provides a cmake config for the default version of Gazebo for the ROS distribution. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "libgazebo9-dev"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "gazebo9"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"


SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/dashing/gazebo_dev/3.3.2-1.zip;downloadfilename=gazebo-dev_3.3.2-1.zip"
SRC_URI[md5sum] = "56286d208d857da7d924fe8f5207478d"
SRC_URI[sha256sum] = "4481e4d56ba36f0b34a3ea6f063902d38550560cdef076040147340707d25308"

S = "${WORKDIR}/gazebo_ros_pkgs-release-release-dashing-gazebo_dev-3.3.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

