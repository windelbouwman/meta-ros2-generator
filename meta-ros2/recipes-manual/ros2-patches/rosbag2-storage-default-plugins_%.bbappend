
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://strip-vendor-package-from-cmake.patch"

DEPENDS_remove = " sqlite3-vendor"
DEPENDS_append = " sqlite3"

RDEPENDS_${PN}_remove = " sqlite3-vendor"
RDEPENDS_${PN}_append = " sqlite3"
