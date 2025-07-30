package com.deliverychainmanagementsystem;

public class ManagementSystem {
    Node packageContentsHead;
    Node packageStatusHead;
    Node packageIdHead;
    Node packageCheckpointHead;

    // Constructor
    ManagementSystem() {
        this.packageContentsHead = null;
        this.packageStatusHead = null;
        this.packageIdHead = null;
        this.packageCheckpointHead = null;
    }

    // Add package content
    public void addPackageContent(String content) {
        Node newNode = new Node(content);
        newNode.next = packageContentsHead;
        packageContentsHead = newNode;
    }

    // Add package status
    public void addPackageStatus(String status) {
        Node newNode = new Node(status);
        newNode.next = packageStatusHead;
        packageStatusHead = newNode;
    }

    // Add package ID
    public void addPackageId(String id) {
        Node newNode = new Node(id);
        newNode.next = packageIdHead;
        packageIdHead = newNode;
    }

    // Add package checkpoint
    public void addPackageCheckpoint(String checkpoint) {
        Node newNode = new Node(checkpoint);
        newNode.next = packageCheckpointHead;
        packageCheckpointHead = newNode;
    }

    // Check order status by ID
    public void checkOrderStatus(String userPackageId, String userName) {
        Node idNode = packageIdHead;
        Node statusNode = packageStatusHead;
        boolean found = false;

        while (idNode != null && statusNode != null) {
            if (idNode.data.equals(userPackageId)) {
                System.out.println(userName + ", your package with ID: " + idNode.data);
                System.out.println("Status: " + statusNode.data);
                found = true;

                if (statusNode.data.equalsIgnoreCase("lost")) {
                    Node idTemp = packageIdHead;
                    Node checkpointTemp = packageCheckpointHead;

                    while (idTemp != null && checkpointTemp != null) {
                        if (idTemp.data.equals(userPackageId)) {
                            System.out.println("Package was lost at checkpoint: " + checkpointTemp.data);
                            break;
                        }
                        idTemp = idTemp.next;
                        checkpointTemp = checkpointTemp.next;
                    }
                }
                break;
            }
            idNode = idNode.next;
            statusNode = statusNode.next;
        }

        if (!found) {
            System.out.println("Your package was not found. It may be lost.");
        }
    }

    // Check package checkpoint and contents
    public void checkPackageDetails(String userPackageId) {
        Node idNode = packageIdHead;
        Node checkpointNode = packageCheckpointHead;
        Node contentNode = packageContentsHead;

        while (idNode != null && checkpointNode != null && contentNode != null) {
            if (idNode.data.equals(userPackageId)) {
                System.out.println("Package contains: " + contentNode.data);
                System.out.println("Checkpoint: " + checkpointNode.data);
                break;
            }
            idNode = idNode.next;
            checkpointNode = checkpointNode.next;
            contentNode = contentNode.next;
        }
    }
}
