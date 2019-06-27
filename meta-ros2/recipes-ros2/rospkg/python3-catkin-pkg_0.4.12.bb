
SUMMARY = "catkin package library"
SECTION = "devel/python"
HOMEPAGE = "https://wiki.ros.org/catkin_pkg"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

PYPI_PACKAGE="catkin_pkg"

SRC_URI[md5sum] = "e5103b99a66a74ca7e5104542a897de2"
SRC_URI[sha256sum] = "77fdfdcf79b1b92498c83eede9ef727e9c6eeec5b0a5e49c0ce83b8caa0afb36"

inherit pypi setuptools3

BBCLASSEXTEND = "native nativesdk"

PROVIDES += "python3-catkin-pkg-modules"
