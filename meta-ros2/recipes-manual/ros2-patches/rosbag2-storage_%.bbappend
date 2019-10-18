
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://remove-vendor-packages.patch"

DEPENDS_remove = " yaml-cpp-vendor"
DEPENDS_append = " yaml-cpp"

RDEPENDS_${PN}_remove = " yaml-cpp-vendor"
RDEPENDS_${PN}_append = " yaml-cpp"
