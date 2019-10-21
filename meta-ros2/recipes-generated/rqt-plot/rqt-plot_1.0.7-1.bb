
# ATTENTION!! AUTOMATICALLY GENERATED

DESCRIPTION = "rqt_plot provides a GUI plugin visualizing numeric values in a 2D plot using different plotting backends."
SECTION = "devel"

ROS_BUILD_DEPENDS = ""
ROS_BUILDTOOL_DEPENDS = "ament-cmake-native"
ROS_BUILD_EXPORT_DEPENDS = ""
ROS_BUILDTOOL_EXPORT_DEPENDS = ""
ROS_EXEC_DEPENDS = "python-qt-binding python3-catkin-pkg-modules python3-matplotlib python3-numpy qt-gui-py-common rclpy rqt-gui rqt-gui-py rqt-py-common std-msgs"
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_BUILD_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"


LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"


SRC_URI = "https://github.com/ros2-gbp/rqt_plot-release/archive/release/dashing/rqt_plot/1.0.7-1.zip;downloadfilename=rqt-plot_1.0.7-1.zip"
SRC_URI[md5sum] = "77e4737f04b763cab4e95cc13361e724"
SRC_URI[sha256sum] = "764fa62d031997bea0b6c3daa1f66662ac569347c0ea4ca18c14208b52f78a27"

S = "${WORKDIR}/rqt_plot-release-release-dashing-rqt_plot-1.0.7-1"

ROS_BUILD_TYPE = "ament_cmake"
inherit ros2_${ROS_BUILD_TYPE}

BBCLASSEXTEND += "native"

