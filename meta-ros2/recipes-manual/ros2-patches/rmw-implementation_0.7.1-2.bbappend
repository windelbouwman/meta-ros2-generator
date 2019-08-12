
# Strip off opensplice and connext rmw implementations

RDEPENDS_${PN}_remove = " rmw-opensplice-cpp rmw-connext-cpp poco-vendor libpoco-dev "
DEPENDS_remove = " rmw-opensplice-cpp rmw-connext-cpp poco-vendor"

DEPENDS_append = " ament-cmake rmw-fastrtps-cpp rosidl-typesupport-fastrtps-cpp rmw-fastrtps-shared-cpp "
# jkgf gjfk

EXTRA_OECMAKE_append = " -DRMW_IMPLEMENTATION=rmw_fastrtps_cpp "
