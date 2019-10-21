
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The component command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python composition-interfaces rcl-interfaces rclcpp-components rclpy ros2cli ros2node ros2param ros2pkg"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2component/0.7.7-1.zip;downloadfilename=ros2component_0.7.7-1.zip"
SRC_URI[md5sum] = "8a72bdf4c034e71ab54113fb5b75ac9e"
SRC_URI[sha256sum] = "2658c1f1f4f2d0829d37670143102cf9153e2f154fbadfac9a147ca5ed4b560a"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2component-0.7.7-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

