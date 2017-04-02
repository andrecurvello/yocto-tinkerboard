# Copyright (C) 2017 Romain Perier
# Copyright (C) 2017 Eddie Cai
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git"

SRCREV = "7089db84e356562f8ba737c29e472cc42d530dbc"
LINUX_VERSION = "4.10"
# Override local version in order to use the one generated by linux build system
# And not "yocto-standard"
LINUX_VERSION_EXTENSION = ""
PR = "r1"
PV = "${LINUX_VERSION}-rc8"

# Include only supported boards for now
COMPATIBLE_MACHINE = "(radxarock|marsboard-rk3066|firefly-rk3288|rock2-square)"
deltask kernel_configme
