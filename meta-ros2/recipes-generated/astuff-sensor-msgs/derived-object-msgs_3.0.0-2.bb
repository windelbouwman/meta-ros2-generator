
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Abstracted Messages from Perception Modalities"
SECTION = "devel"

ROS_BUILD_DEPENDS = "builtin-interfaces geometry-msgs radar-msgs shape-msgs std-msgs"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native rosidl-default-generators-native"
ROS_BUILD_EXPORT_DEPENDS = "builtin-interfaces geometry-msgs radar-msgs shape-msgs std-msgs"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "builtin-interfaces geometry-msgs radar-msgs rosidl-default-runtime shape-msgs std-msgs"
ROS_TEST_DEPENDS = "ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"


SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/dashing/derived_object_msgs/3.0.0-2.zip;downloadfilename=derived-object-msgs_3.0.0-2.zip"
SRC_URI[md5sum] = "9f70f8bab08a9c8cf9885634212ec552"
SRC_URI[sha256sum] = "862d9d65a5b9772c1f288d897e2af60cd8cdae182b02d36779abafc533a1f4d3"

S = "${WORKDIR}/astuff_sensor_msgs-release-release-dashing-derived_object_msgs-3.0.0-2"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

