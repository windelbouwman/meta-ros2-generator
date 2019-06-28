
# FILES_${PN}_append = " /usr/cmake/yaml*.cmake"

FILES_${PN} = " ${prefix}/cmake/* ${datadir}/*"

do_install_append () {
   rm -rf ${D}${libdir}
   rm -rf ${D}${includedir}
}
