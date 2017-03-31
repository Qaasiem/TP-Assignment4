import Obey.StaffMember;
import Violate.StaffMember1;
import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-31.
 */
public class SRPTest extends TestCase
{
    ////      Obey      ////
    StaffMember s = new StaffMember();
    public void testName() throws Exception
    {
        s.setName("Lukes");
        assertEquals(s.getName(),"Lukes");
    }

    public void testSal() throws Exception
    {
        s.setSal(12000);
        assertEquals(s.getSal(),12000);
    }

    public void testStaffNo() throws Exception
    {
        s.setStaffNo(67788);
        assertEquals(s.getStaffNo(),67788);
    }

    ////      Violate     ////
    StaffMember1 s1 = new StaffMember1();
    public void testName1() throws Exception
    {
        s1.setName("Joe");
        assertEquals(s1.getName(),"Joe");
    }

    public void testSal1() throws Exception
    {
        s1.setSal(4800);
        assertEquals(s1.getSal(),4800);
    }

    public void testStaffNo1() throws Exception
    {
        s1.setStaffNo(91123);
        assertEquals(s1.getStaffNo(),91123);
    }
}
