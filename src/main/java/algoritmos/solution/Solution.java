package algoritmos.solution;

import algoritmos.FromScannedLineToLine;
import algoritmos.ReadFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution implements FromScannedLineToLine{
  public String process(Scanner in) {
    int friends = in.nextInt();
    int seats = in.nextInt();
    List<Ticket> tickets = new ArrayList<>();

    for (int i = 0; i < friends; i++) {
      tickets.add(new Ticket(in.nextInt(), in.nextInt()));
    }

    return "" + this.friendsOnSameRow(seats, tickets);
  }

  public static void main(String[] args) {
    new ReadFile().process(new Solution());
  }


  public int friendsOnSameRow(int seats, List<Ticket> tickets){
    int[][] show = new int[seats+1][seats+1];
    for (Ticket ticket: tickets) {
      int row = ticket.getRow();
      int column = ticket.getColumn();

      show[row][column] = 1;
      show[column][row] = 1;
    }

    List<Integer> sum = new ArrayList<>();
    for (int i=0;i<seats+1;i++){
      int total = 0;
      for (int j=0;j<seats+1;j++){
        total += show[i][j];
      }
      sum.add(total);
    }
    return Collections.max(sum);
  }

}
