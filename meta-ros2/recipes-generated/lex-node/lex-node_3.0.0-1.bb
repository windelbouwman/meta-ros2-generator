
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "Package providing a ROS node for interacting with Amazon Lex"
SECTION = "devel"

ROS_BUILD_DEPENDS = "aws-common aws-ros2-common lex-common lex-common-msgs rclcpp"
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = "aws-common lex-common"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "aws-common aws-ros2-common launch launch-ros lex-common lex-common-msgs rclcpp"
ROS_TEST_DEPENDS = "ament-cmake-gmock ament-lint-auto ament-lint-common"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=80318c4afef111a7690eaf237460856b"


SRC_URI = "https://github.com/aws-gbp/lex_node-release/archive/release/dashing/lex_node/3.0.0-1.zip;downloadfilename=lex-node_3.0.0-1.zip"
SRC_URI[md5sum] = "fee6a2df584b4ebcb441ec32dd834899"
SRC_URI[sha256sum] = "2445d2b66b8417275080e2539a6e61d78000e0388c1772302a1abe1a26625463"

S = "${WORKDIR}/lex_node-release-release-dashing-lex_node-3.0.0-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

