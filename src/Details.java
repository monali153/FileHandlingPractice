import java.util.Arrays;

public class Details {

    public static void main(String[] args) {

        String[] lines = new String[]{"ABHINAV PANDEY,23,male,1569874465,chintu@gmail.com",
               "AJAY CHAVAN,88,male,55266823036,email@gmail.com",
               "ASHWANI RAJPUT,22,male,8449441544,chiku123@gmail.com",
            "KORNI ARJUN REDDY,21,male,6303267456,arjun@123",
                "KURAKULA NIKHIL,22,male,9849588370,Nikhil123@a.com",
               "MEGHALI LALIT CHAUDHARI,21,female,7545156463,megha@123.com",
               "MONALI GOVIND SHARMA,24,female,9245637823,sona123@gmail.com",
                "NILUFA KHAN,40,female,1234567890,kp@gmail.com",
             "RISHABH KUMAR PATHAK,23,male,956478210,rishabh88@gmail.com",
               "ROHIT RAJ,22,male,8874925678,raaz20lmp@gmail.com",
                "SAURABH KUMAR TIWARI,24,male,9998887770,saurabh.kumar@outlook.com",
               "SOUVIK ROUT,23,male,2545665455,srs@hotmail.com",
                "VIPUL NAVALE,23,male,97465792389,vipul27@gmail.com",
                "VISHAL PRASAD,23,male,9998887770,vishal7668@gmail.com",
                "AMAN GUPTA,23,male,1234545410,abc@xyz.com",
                "KULSUMA KHATUN,21,female,1234234,kk@gmai.com",
                "PRIYANKA DEWANGAN,22,female,9876543210,priya123@gmail.com",
                "TEJAS RAJAN,22,male,8965432110,tejas@yahoo.com",
                "ROHIT NARNAWARE,16,male,9921879987,rohitWHO@gmail.zom",
                "MOHD ZAID,58,male,011564329,ajcolin@nomai.com",
                "LALIT GAURAV SAINI,28,male,7404416815,lalitgauravsaini@gmail.com",
                "KUNAL KUMAR SHARMA,22,male,8668034388,kunalsharmaraj09@gmail.com",
                "SAURABH MISHRA,25,Male,6969226969,iamtheone@gmail.com",
                "SAIYAM CHAUHAN,33,Male,8765444477,saiyam@gmail.com",
                "SHUBHAM CHAUHAN,25,Male,112233,AbcXyz@gmail.com",
                "SHUBHAM ARVIND PAWAR,34,male,345657,pawar@gmail.com",
                "GAJARAO BALASUBRAMANYAM,18,Male,8919939222,subbu.balu@gmail.com"
        };

        String[] array = new String[lines.length];
        StudentDetails[] studentDetails = new StudentDetails[lines.length];

        for (int i = 0; i < lines.length; i++) {
            String[] split = lines[i].split(",");
            studentDetails[i] = new StudentDetails();
            studentDetails[i].setName(split[0]);
            studentDetails[i].setAge(Integer.parseInt(split[1]));
            studentDetails[i].setGender(split[2]);
            studentDetails[i].setMobile(Long.parseLong(split[3]));
            studentDetails[i].setEmail(split[4]);

        }

        for (int i = 0; i < studentDetails.length; i++) {
            System.out.println(studentDetails[i]);
        }


    }

}
