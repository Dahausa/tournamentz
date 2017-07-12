package tournamentz;


import org.junit.Assert;
import org.junit.Test;

import com.dahausa.tournamentz.team.domain.Team;
import com.dahausa.tournamentz.team.domain.exceptions.CannotCreateTeamException;

public class TeamTest {

	@Test
	public void testCreate() throws  CannotCreateTeamException  {
		//Arrange
		final String teamName = "Team One";
		
		//Act
		Team createdTeam = Team.create(teamName);
		//Assert
		Assert.assertEquals(teamName,createdTeam.getName());
	}
	
	@Test
	public void testStoreTeam(){
	}

}
