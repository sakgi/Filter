package dem;
	import java.awt.GridLayout;
//import javax.swing.*;
	//import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

	public class a extends JFrame {
	    private JComboBox<String> endYearFilter;
	    private JComboBox<String> topicsFilter;
	    private JComboBox<String> sectorFilter;
	    private JComboBox<String> regionFilter;
	    private JComboBox<String> pestFilter;
	    private JComboBox<String> sourceFilter;
	    private JComboBox<String> swotFilter;
	    private JTextField countryTextField;
	    private JTextField cityTextField;

	    public a() {
	        super("Dashboard");

	        // Create components
	        endYearFilter = new JComboBox<>(new String[]{"2021", "2022", "2023"}); // Add your years
	        topicsFilter = new JComboBox<>(new String[]{"Topic 1", "Topic 2", "Topic 3"}); // Add your topics
	        sectorFilter = new JComboBox<>(new String[]{"Sector 1", "Sector 2", "Sector 3"}); // Add your sectors
	        regionFilter = new JComboBox<>(new String[]{"Region 1", "Region 2", "Region 3"}); // Add your regions
	        pestFilter = new JComboBox<>(new String[]{"PEST 1", "PEST 2", "PEST 3"}); // Add your PEST options
	        sourceFilter = new JComboBox<>(new String[]{"Source 1", "Source 2", "Source 3"}); // Add your sources
	        swotFilter = new JComboBox<>(new String[]{"SWOT 1", "SWOT 2", "SWOT 3"}); // Add your SWOT options
	        countryTextField = new JTextField();
	        cityTextField = new JTextField();

	        // Layout
	        setLayout(new GridLayout(10, 2));

	        // Add components to the layout
	        add(new JLabel("End Year Filter:"));
	        add(endYearFilter);
	        add(new JLabel("Topics Filter:"));
	        add(topicsFilter);
	        add(new JLabel("Sector Filter:"));
	        add(sectorFilter);
	        add(new JLabel("Region Filter:"));
	        add(regionFilter);
	        add(new JLabel("PEST Filter:"));
	        add(pestFilter);
	        add(new JLabel("Source Filter:"));
	        add(sourceFilter);
	        add(new JLabel("SWOT Filter:"));
	        add(swotFilter);
	        add(new JLabel("Country:"));
	        add(countryTextField);
	        add(new JLabel("City:"));
	        add(cityTextField);

	        // Add a button to perform an action (you can replace this with your actual dashboard content)
	        JButton filterButton = new JButton("Apply Filters");
	        filterButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Perform actions based on selected filters
	                String selectedEndYear = (String) endYearFilter.getSelectedItem();
	                String selectedTopic = (String) topicsFilter.getSelectedItem();
	                // Add more logic for other filters...

	                // Print or use the selected filters
	                System.out.println("Selected End Year: " + selectedEndYear);
	                System.out.println("Selected Topic: " + selectedTopic);
	                // Print or use other selected filters...
	            }
	        });
	        add(filterButton);

	        // Set JFrame properties
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new a();
	            }
	        });
	    }
	}

