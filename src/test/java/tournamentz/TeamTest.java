package tournamentz;

import org.junit.Assert;
import org.junit.Test;

import com.dahausa.tournamentz.team.Team;
import com.dahausa.tournamentz.team.TeamContact;
import com.dahausa.tournamentz.team.exceptions.CannotCreateTeamContactException;
import com.dahausa.tournamentz.team.exceptions.CannotCreateTeamException;

public class TeamTest {

	@Test
	public void testCreate() throws CannotCreateTeamContactException, CannotCreateTeamException  {
		//Arrange
		final String teamName = "Team One";
		
		TeamContact captain = TeamContact.create("Jörn Hauser", "joernhauser@mailbox.org");
		
		//Act
		Team createdTeam = Team.create(teamName, captain);
		//Assert
		Assert.assertEquals(teamName,createdTeam.getName());
	}

}
