
DEPENDS_remove = " libyaml-vendor "

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://01-drop-yaml-vendor-dependency.patch"
