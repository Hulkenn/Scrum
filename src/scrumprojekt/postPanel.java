/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumprojekt;

/**
 *
 * @author Joakim
 */
public class postPanel extends javax.swing.JPanel {

    /**
     * Creates new form postPanel
     */
    public postPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        postOne = new javax.swing.JPanel();
        headlinePostOne = new javax.swing.JLabel();
        imagePostOne = new javax.swing.JLabel();
        authorPostOne = new javax.swing.JLabel();
        datePostOne = new javax.swing.JLabel();
        lastReplyPostOne = new javax.swing.JLabel();
        dateLastReplyPostOne = new javax.swing.JLabel();

        postOne.setBackground(new java.awt.Color(250, 249, 246));
        postOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        headlinePostOne.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        headlinePostOne.setText("Headline:");

        imagePostOne.setText("IMAGE");

        authorPostOne.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        authorPostOne.setText("Author");

        datePostOne.setText("Date and time");

        lastReplyPostOne.setText("Last reply");

        dateLastReplyPostOne.setText("Date and time ");

        javax.swing.GroupLayout postOneLayout = new javax.swing.GroupLayout(postOne);
        postOne.setLayout(postOneLayout);
        postOneLayout.setHorizontalGroup(
            postOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postOneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePostOne)
                .addGap(17, 17, 17)
                .addGroup(postOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headlinePostOne)
                    .addGroup(postOneLayout.createSequentialGroup()
                        .addComponent(authorPostOne)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datePostOne)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 745, Short.MAX_VALUE)
                .addGroup(postOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastReplyPostOne)
                    .addComponent(dateLastReplyPostOne))
                .addGap(127, 127, 127))
        );
        postOneLayout.setVerticalGroup(
            postOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postOneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(postOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headlinePostOne)
                    .addComponent(imagePostOne)
                    .addComponent(lastReplyPostOne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(postOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(postOneLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(postOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datePostOne)
                            .addComponent(authorPostOne)))
                    .addGroup(postOneLayout.createSequentialGroup()
                        .addComponent(dateLastReplyPostOne)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(postOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(postOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorPostOne;
    private javax.swing.JLabel dateLastReplyPostOne;
    private javax.swing.JLabel datePostOne;
    private javax.swing.JLabel headlinePostOne;
    private javax.swing.JLabel imagePostOne;
    private javax.swing.JLabel lastReplyPostOne;
    private javax.swing.JPanel postOne;
    // End of variables declaration//GEN-END:variables
}
