
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = " The ability to check code against style conventions using uncrustify and generate xUnit test result files. "
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = ""
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "uncrustify-vendor"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"


SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/dashing/ament_uncrustify/0.7.11-1.zip;downloadfilename=ament-uncrustify_0.7.11-1.zip"
SRC_URI[md5sum] = "895bcd3fc1a06a404427b9fbd4e56626"
SRC_URI[sha256sum] = "03de612614bdd72296211c2845e12252f09f140e27934b62353aa134ba6e1be3"

S = "${WORKDIR}/ament_lint-release-release-dashing-ament_uncrustify-0.7.11-1"

ROS_BUILD_TYPE = "ament_python"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

