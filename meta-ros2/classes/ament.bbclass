
DEPENDS_append = " python3-catkin-pkg-native "

ROS_BPN ?= "${@d.getVar('BPN', True).replace('-', '_')}"

# S = "${WORKDIR}/git/${ROS_BPN}"

export AMENT_PREFIX_PATH="${STAGING_DIR_HOST}${prefix};${STAGING_DIR_NATIVE}${prefix}"

inherit python3native

do_install_append() {
    rm -rf ${D}${datadir}/${ROS_BPN}/environment
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.bash
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.sh
    rm -f ${D}${datadir}/${ROS_BPN}/local_setup.zsh
    rm -f ${D}${prefix}/local_setup.bash
    rm -f ${D}${prefix}/local_setup.sh
    rm -f ${D}${prefix}/local_setup.zsh
    rm -f ${D}${prefix}/setup.bash
    rm -f ${D}${prefix}/setup.sh
    rm -f ${D}${prefix}/setup.zsh
    rm -f ${D}${prefix}/_order_packages.py
}

FILES_${PN} = " \
    ${datadir}/${ROS_BPN}/package.xml \
    ${datadir}/${ROS_BPN}/resource/* \
    ${datadir}/${ROS_BPN}/msg/* \
    ${datadir}/${ROS_BPN}/srv/* \
    ${datadir}/${ROS_BPN} \
    ${datadir}/ament_index/* \
    ${libdir}/${PYTHON_DIR}/* \
    ${libdir}/${ROS_BPN}/* \
    ${libdir}/lib*.so \
"

FILES_${PN}-dev = " \
    ${datadir}/${ROS_BPN}/cmake/* \
    ${includedir} \
"
