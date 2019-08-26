
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package provides a behavior trees core. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "libzmq3-dev"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "libzmq3-dev"
ROS_TEST_DEPENDS = "ament-cmake-gtest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp-release/archive/release/dashing/behaviortree_cpp/2.5.2-1.zip;downloadfilename=behaviortree-cpp_2.5.2-1.zip"
SRC_URI[md5sum] = "3ea64a1cedbda7555ec0e031c51d644d"
SRC_URI[sha256sum] = "4468030a8e90e8f19bb2e3485030efa2014180c1b52ea9a35759bf7148eabc65"

S = "${WORKDIR}/behaviortree_cpp-release-release-dashing-behaviortree_cpp-2.5.2-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

