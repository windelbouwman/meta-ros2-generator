
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " This package provides the Behavior Trees core library. "
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


SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp_v3-release/archive/release/dashing/behaviortree_cpp_v3/3.0.9-1.zip;downloadfilename=behaviortree-cpp-v3_3.0.9-1.zip"
SRC_URI[md5sum] = "e768df2eaf894ec683600fca8569003b"
SRC_URI[sha256sum] = "c263467d68e5df844bb482f76c2c6274d4aa624cca33cc74d09e222bd9575d24"

S = "${WORKDIR}/behaviortree_cpp_v3-release-release-dashing-behaviortree_cpp_v3-3.0.9-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

