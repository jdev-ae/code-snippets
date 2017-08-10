public MyTreeCellRenderer implements TreeCellRenderer {	
  JLabel label;
  
  public MyTreeCellRenderer () {
    label = new JLabel();
    // set global properties for the label here like
    // setFont(..);
    // setBackground(..);
  }  

  public Component getTreeCellRendererComponent (JTree tree, Object value, boolean isSelected, 
					         boolean isExpanded, boolean isLeaf, int index, 
					         boolean hasFocus) {
    if (value instanceof MyData) {
      label.setIcon(((MyData)value).getIcon());
      label.setText(((MyData)value).getString());
    } else {
      label.setIcon(null);
      label.setText(""+value);
    }
    return label;
  }
}