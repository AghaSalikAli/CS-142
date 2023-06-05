import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Table {
    Cell[][] cells;
    Titlebar titlebar;
    Color tbar;
    Color tbarBorder;
    Color headingcolor;
    Color bordercolor;
    Color cellcolor;
    Color textcolor;
    File datafile;
    public String filepath;


    public Table(String filepath, Color tbar,Color tbarBorder, Color headingcolor, Color bordercolor, Color cellcolor, Color textcolor) throws FileNotFoundException {
        this.filepath = filepath;
        datafile = new File(filepath);
        this.tbar = tbar;
        this.tbarBorder = tbarBorder;
        this.headingcolor = headingcolor;
        this.bordercolor = bordercolor;
        this.cellcolor = cellcolor;
        this.textcolor = textcolor;
    }

    public boolean checkIfEmpty() throws FileNotFoundException {
        Scanner sc = new Scanner(datafile);
        return sc.hasNext();
    }

    public void paintDefault(Graphics g) {
        titlebar = new Titlebar();
        titlebar.paintDefault(g);
        cells = new Cell[15][5];
        int cellWidth = (2*titlebar.stroke + titlebar.width) / 5;
        int cellHeight = ((450 - titlebar.topleft.y + titlebar.height) / 15);
        for (int i = 0; i < cells[0].length; i++) {
            cells[0][i] = new Cell(titlebar.topleft.x + (cellWidth * (i)), titlebar.topleft.y + titlebar.height, cellWidth, cellHeight, Color.pink, Color.blue, 5, "default", Color.black);
            cells[0][i].fontsize = 15;
            cells[0][i].font = new Font("Calibri", Font.PLAIN, cells[0][i].fontsize);
            cells[0][i].paint(g);
        }

        for (int i = 1; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell(titlebar.topleft.x + (cellWidth * (j)), cells[0][0].topleft.y + (cellHeight * i), cellWidth, cellHeight, Color.lightGray, Color.blue, 5, "default", Color.black);
                cells[i][j].fontsize = 15;
                cells[i][j].font = new Font("Calibri", Font.PLAIN,cells[i][j].fontsize);
                cells[i][j].paintNormal(g);
            }
        }
    }

    public void paintData(Graphics g) throws FileNotFoundException {
        Scanner sc = new Scanner(datafile);
        titlebar = new Titlebar(50, 100, 590, 100, 10, tbar, tbarBorder, sc.nextLine());
        titlebar.paintData(g);
        //calculate rows and columns
        int rows = 0;
        int columns =0;
        String a = sc.nextLine();
        rows++;
        String []b = a.split(" ");
        columns = b.length;
        while (sc.hasNextLine()) {
            sc.nextLine();
            rows++;
        }
        cells = new Cell[rows][columns];
        Scanner sc1 = new Scanner(datafile);
        sc1.nextLine();
        int cellWidth = ((2*titlebar.stroke)+ titlebar.width) / columns;
        int cellHeight = ((450 - titlebar.topleft.y + titlebar.height) / rows);
        for (int i = 0; i < cells[0].length; i++) {
            cells[0][i] = new Cell(titlebar.topleft.x + (cellWidth * (i)), titlebar.topleft.y + titlebar.height, cellWidth, cellHeight, headingcolor, bordercolor, 5, sc1.next(), textcolor);
            cells[0][i].fontsize = 15;
            cells[0][i].font = new Font("Calibri", Font.PLAIN, cells[0][i].fontsize);
            cells[0][i].paint(g);
        }

        for (int i = 1; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell(titlebar.topleft.x + (cellWidth * (j)), cells[0][0].topleft.y + (cellHeight * i), cellWidth, cellHeight, cellcolor, bordercolor, 5, sc1.next(), textcolor);
                cells[i][j].fontsize = 15;
                cells[i][j].font = new Font("Calibri", Font.PLAIN,  cells[i][j].fontsize);
                cells[i][j].paintNormal(g);
            }

        }
    }
}