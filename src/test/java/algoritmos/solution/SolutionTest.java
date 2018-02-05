package algoritmos.solution;

import static org.assertj.core.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

  private Solution solution;

  @Before
  public void setup(){
    solution = new Solution();
  }

  @Test
  public void theSame(){
    List<Ticket> tickets = Arrays.asList(new Ticket(1,2), new Ticket(1,2));
    assertThat(solution.friendsOnSameRow(3,tickets)).isEqualTo(1);
  }

  @Test
  public void threeVariants(){
    List<Ticket> tickets = Arrays.asList(new Ticket(1,2), new Ticket(2,3), new Ticket(2,2));
    assertThat(solution.friendsOnSameRow(3,tickets)).isEqualTo(3);
  }

  @Test
  public void otherThreeVariants(){
    List<Ticket> tickets = Arrays.asList(new Ticket(1,1), new Ticket(2,2), new Ticket(1,2));
    assertThat(solution.friendsOnSameRow(3,tickets)).isEqualTo(2);
  }

}
