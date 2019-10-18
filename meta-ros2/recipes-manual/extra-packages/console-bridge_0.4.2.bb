DESCRIPTION = "A ROS-independent package for logging that seamlessly pipes into rosconsole/rosout for ROS-dependent packages."

SECTION = "DEVEL"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "\
    file://include/console_bridge/console.h;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
    file://src/console.cpp;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
"

PROVIDES += " libconsole-bridge-dev"
RPROVIDES_${PN}_append = " libconsole-bridge-dev"
ROS_BPN = "console_bridge"
ROS_SP = "${ROS_BPN}-${PV}"

SRC_URI = "https://github.com/ros/${ROS_BPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "12e9a6b876ef160fc4a705003790ede0"
SRC_URI[sha256sum] = "f44641bed7268d72354476c8c5ff936f0e600e4170e1ff7f61a4b6e1f3fc20ff"

S = "${WORKDIR}/${ROS_SP}"

inherit cmake

FILES_${PN} += "${libdir}/${ROS_BPN}/cmake"