
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The pkg command for ROS 2 command line tools. "
SECTION = "devel"

ROS_BUILD_DEPENDS = "ros2cli"
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = "ros2cli"
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "ament-index-python python3-catkin-pkg-modules python3-empy python3-pkg-resources ros2cli"
ROS_TEST_DEPENDS = "ament-copyright ament-flake8 ament-pep257 ament-xmllint python3-pytest"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/dashing/ros2pkg/0.7.4-1.zip;downloadfilename=ros2pkg_0.7.4-1.zip"
SRC_URI[md5sum] = "74551feaf9a6abc56ff1b32d87cdf0eb"
SRC_URI[sha256sum] = "cd03b50959af2030827f0b5fd1d85ed9686863ddffd1ec3d1248795d5217c20a"

S = "${WORKDIR}/ros2cli-release-release-dashing-ros2pkg-0.7.4-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

