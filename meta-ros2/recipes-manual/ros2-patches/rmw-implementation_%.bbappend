
DEPENDS_append = " ament-cmake rmw-fastrtps-cpp rosidl-typesupport-fastrtps-cpp rmw-fastrtps-shared-cpp "

EXTRA_OECMAKE_append = " -DRMW_IMPLEMENTATION=rmw_fastrtps_cpp "

