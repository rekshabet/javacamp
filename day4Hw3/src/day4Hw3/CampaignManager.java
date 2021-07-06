package day4Hw3;

public class CampaignManager {

public void add(Campaign campaign) {
	System.out.println(campaign.getName()+" isimli kampanya eklendi");
}
public void update(Campaign campaign) {
	System.out.println(campaign.getName()+" isimli kampanya güncellendi");
}
public void delete(Campaign campaign) {
	System.out.println(campaign.getName()+" isimli kampanya silindi");
}
}
