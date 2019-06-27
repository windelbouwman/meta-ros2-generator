
DESCRIPTION = "A templating system for Python."
SECTION = "devel/python"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34"
SRCNAME = "empy"

SRC_URI = "http://www.alcyone.com/software/empy/empy-${PV}.tar.gz"
SRC_URI[md5sum] = "8bae96e87128393448c1ec837ae78c85"
SRC_URI[sha256sum] = "9126211471fc7ff83fdd40beca93eb6de5681758fbe68b4cf8af6326259df1b1"

S = "${WORKDIR}/${SRCNAME}-${PV}"

BBCLASSEXTEND = "native nativesdk"

inherit distutils3
