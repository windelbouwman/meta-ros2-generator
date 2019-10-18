
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://remove-vendor-packages.patch"

DEPENDS_remove = "console-bridge-vendor"
RDEPENDS_${PN}_remove = "console-bridge-vendor libconsole-bridge-dev"
RDEPENDS_${PN}_append = " console-bridge"
