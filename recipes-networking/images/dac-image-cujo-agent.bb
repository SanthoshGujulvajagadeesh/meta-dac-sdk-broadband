SUMMARY = "DAC Container image with cujo agent"

inherit  dac-image-cujo-agent

IMAGE_INSTALL = "cujo-agent-oem"

cleanup_libs () {
    rm -rf ${IMAGE_ROOTFS}/usr/lib/opkg/
}

ROOTFS_POSTPROCESS_COMMAND += "cleanup_libs; "

# needed
OCI_IMAGE_ENTRYPOINT = "/usr/bin/launch-cujo-agent"
APP_METADATA_PATH = "metadatas/cujo-agent-appmetadata.json"


# optional
OCI_IMAGE_AUTHOR = "rdkcentral"
OCI_IMAGE_AUTHOR_EMAIL = "info@rdkcentral.com"
OCI_IMAGE_ENTRYPOINT_ARGS = "start"
OCI_IMAGE_WORKINGDIR = "/"
