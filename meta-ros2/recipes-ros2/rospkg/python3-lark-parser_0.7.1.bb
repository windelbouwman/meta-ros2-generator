
SUMMARY = "a modern parsing library"
SECTION = "devel/python"
HOMEPAGE = "https://github.com/lark-parser/lark"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a68416544bf138dbcf4dab6e9423231"

PYPI_PACKAGE="lark-parser"

SRC_URI[md5sum] = "77fd251e85495e2bd41eb315b6ba30ec"
SRC_URI[sha256sum] = "8455e05d062fa7f9d59a2735583cf02291545f944955c4056bf1144c4e625344"

inherit pypi setuptools3

BBCLASSEXTEND = "native nativesdk"
