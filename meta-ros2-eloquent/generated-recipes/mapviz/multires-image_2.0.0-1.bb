# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "multires_image"
AUTHOR = "P. J. Reed <preed@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/mapviz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mapviz"
ROS_BPN = "multires_image"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    gps-msgs \
    mapviz \
    pluginlib \
    qtbase \
    rclcpp \
    swri-math-util \
    swri-transform-util \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    qtbase-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    gps-msgs \
    mapviz \
    pluginlib \
    qtbase \
    rclcpp \
    swri-math-util \
    swri-transform-util \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    gps-msgs \
    mapviz \
    pluginlib \
    qtbase \
    rclcpp \
    rclpy \
    swri-math-util \
    swri-transform-util \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/mapviz-release/archive/release/eloquent/multires_image/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/multires_image"
SRC_URI = "git://github.com/swri-robotics-gbp/mapviz-release;${ROS_BRANCH};protocol=https"
SRCREV = "56cba721081bfa339b7910386666c458b430aee0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
