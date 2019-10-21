
RDEPENDS_${PN}_remove = " \
    libopencv-dev \
    python3-numpy \
    python-numpy \
"

DEPENDS_remove = " \
    libopencv-dev \
    python3-numpy \
    python-numpy \
"

DEPENDS_append = " \
    opencv \
    python3-numpy-native \
    rosidl-adapter \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://0001-Python3-is-included-in-boost.patch"
