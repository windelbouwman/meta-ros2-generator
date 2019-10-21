DESCRIPTION="yaml-cpp is a YAML parser and emitter in C++ matching the YAML 1.2 spec."
HOMEPAGE="https://github.com/jbeder/yaml-cpp/"
SECTION="libs"
LICENSE="MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6a8aaf0595c2efc1a9c2e0913e9c1a2c"

SRC_URI="https://github.com/jbeder/yaml-cpp/archive/yaml-cpp-${PV}.tar.gz"
SRC_URI[md5sum] = "b45bf1089a382e81f6b661062c10d0c2"
SRC_URI[sha256sum] = "77ea1b90b3718aa0c324207cb29418f5bced2354c2e483a9523d98c3460af1ed"

S = "${WORKDIR}/${PN}-${PN}-${PV}"

EXTRA_OECMAKE = "-DYAML_BUILD_SHARED_LIBS=ON -DYAML_CPP_BUILD_TESTS=OFF"

inherit cmake
