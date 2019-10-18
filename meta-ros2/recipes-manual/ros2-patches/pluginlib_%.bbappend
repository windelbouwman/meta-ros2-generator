FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://remove-vendor-packages.patch"

DEPENDS_remove = " tinyxml2-vendor"
DEPENDS_append = " tinyxml2"

RDEPENDS_${PN}_remove = " tinyxml2-vendor"
RDEPENDS_${PN}_append = " tinyxml2"
