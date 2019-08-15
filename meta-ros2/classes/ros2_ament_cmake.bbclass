
DEPENDS_append = " ament-cmake-native \
    ament-cmake-python \
    ament-cmake-libraries \
    ament-cmake-export-definitions \
    ament-cmake-export-include-directories \
    ament-cmake-export-interfaces \
    ament-cmake-export-libraries \
    "

EXTRA_OECMAKE_append = " -DBUILD_TESTING=OFF"

inherit ament cmake
inherit ros2_base


