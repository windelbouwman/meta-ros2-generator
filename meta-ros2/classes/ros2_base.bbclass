
# Base class which is used by all ros2 packages.

# Remove any reference to:
# - the vendor packages yaml-vendor and poco-vendor
# - libssl-dev -> this is a dev dependency and must be removed.
# - opensplice and connext -> we will use fastrtps

RDEPENDS_${PN}_remove = " \
    libpoco-dev \
    poco-vendor \
    yaml-vendor \
    libssl-dev \
    rmw-opensplice-cpp \
    rmw-connext-cpp \
"

DEPENDS_remove = " \
    rmw-opensplice-cpp \
    rmw-connext-cpp \
    rosidl-typesupport-opensplice-c \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-opensplice-cpp \
    rosidl-typesupport-connext-cpp \
    poco-vendor \
    yaml-vendor \
"

