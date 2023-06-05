import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dummy {
}
/*import java.awt.*;
        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class Table {
    Cell[][] cells;
    Titlebar titlebar;
    Color tbar;
    Color headingcolor;
    Color bordercolor;
    Color cellcolor;
    Color textcolor;
    File datafile;
    String filepath;


    public Table(String filepath, Color tbar, Color headingcolor, Color bordercolor, Color cellcolor, Color textcolor) throws FileNotFoundException {
        this.filepath = filepath;
        datafile = new File(filepath);
        this.tbar = tbar;
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
        int cellWidth = (titlebar.width + titlebar.stroke) / 5;
        int cellHeight = ((450 - titlebar.topleft.y + titlebar.height) / 15);
        for (int i = 0; i < cells[0].length; i++) {
            cells[0][i] = new Cell(titlebar.topleft.x + (cellWidth * (i)), titlebar.topleft.y + titlebar.height, cellWidth, cellHeight, Color.pink, Color.blue, 5, "default", Color.black);
            cells[0][i].font = new Font("Calibri", Font.PLAIN, 15);
            cells[0][i].paint(g);
        }

        for (int i = 1; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell(titlebar.topleft.x + (cellWidth * (j)), cells[0][0].topleft.y + (cellHeight * i), cellWidth, cellHeight, Color.lightGray, Color.blue, 5, "default", Color.black);
                cells[i][j].font = new Font("Calibri", Font.PLAIN, 15);
                cells[i][j].paintNormal(g);
            }
        }
    }

    public void paintData(Graphics g) throws FileNotFoundException {
        Scanner sc = new Scanner(datafile);
        titlebar = new Titlebar(100, 100, 540, 100, 10, tbar, bordercolor, sc.nextLine());
        titlebar.paintData(g);
        //calculate rows and columns
       /* int rows = 0;
        int columns =0;
        String a = sc.nextLine();
        rows++;
        String []b = a.split(" ");
        columns = b.length;
        while (sc.hasNextLine())
            rows++;
        cells = new Cell[rows][columns];
        Scanner sc1 = new Scanner(datafile);
        sc1.nextLine();
        int cellWidth = (titlebar.width + titlebar.stroke) / columns;
        int cellHeight = ((450 - titlebar.topleft.y + titlebar.height) / rows);
        for (int i = 0; i < cells[0].length; i++) {
            cells[0][i] = new Cell(titlebar.topleft.x + (cellWidth * (i)), titlebar.topleft.y + titlebar.height, cellWidth, cellHeight, headingcolor, bordercolor, 5, sc1.next(), textcolor);
            cells[0][i].font = new Font("Calibri", Font.PLAIN, 15);
            FontMetrics fm = g.getFontMetrics(cells[0][i].font);
            while (fm.stringWidth(cells[0][i].text) > (cells[0][i].topleft.x+cellWidth-cells[0][i].stroke)- cells[0][i].topleft.x) {
                cells[0][i].fontsize--;
                cells[0][i].font = new Font("Calibri", Font.BOLD, cells[0][i].fontsize);
                g.setFont(cells[0][i].font);
                fm = g.getFontMetrics(cells[0][i].font);
            }
            cells[0][i].paint(g);
        }

       /* for (int i = 1; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                cells[i][j] = new Cell(titlebar.topleft.x + (cellWidth * (j)), cells[0][0].topleft.y + (cellHeight * i), cellWidth, cellHeight, cellcolor, bordercolor, 5, sc1.next(), textcolor);
                cells[i][j].font = new Font("Calibri", Font.PLAIN, 15);
                FontMetrics fm = g.getFontMetrics(cells[0][i].font);
                while (fm.stringWidth(cells[i][j].text) > (cells[i][j].topleft.x+cellWidth-cells[i][j].stroke)- cells[i][j].topleft.x) {
                    cells[i][j].fontsize--;
                    cells[i][j].font = new Font("Calibri", Font.BOLD, cells[i][j].fontsize);
                    g.setFont(cells[i][j].font);
                    fm = g.getFontMetrics(cells[i][j].font);
                }
                cells[i][j].paintNormal(g);
            }

        }
    }
}*/
