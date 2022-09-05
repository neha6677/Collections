package com.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



class ProductionFacility {
	 int pliid; 
	 String pro_facility_name;
	 String pro_fa_location;
	 int totalproduction_perday;
	 String itemnames[];
	 LocalDate prod_date;
	public ProductionFacility(int pliid, String pro_facility_name, String pro_fa_location, int totalproduction_perday,
			String[] itemnames, LocalDate prod_date) {
		super();
		this.pliid = pliid;
		this.pro_facility_name = pro_facility_name;
		this.pro_fa_location = pro_fa_location;
		this.totalproduction_perday = totalproduction_perday;
		this.itemnames = itemnames;
		this.prod_date = prod_date;
	}
	public ProductionFacility(int pliid2, String pro_facility_name2, String pro_fa_location2,
			int totalproduction_perday2, String[] args, int i) {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getPliid() {
		return pliid;
	}
	public void setPliid(int pliid) {
		this.pliid = pliid;
	}
	public String getPro_facility_name() {
		return pro_facility_name;
	}
	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}
	public String getPro_fa_location() {
		return pro_fa_location;
	}
	public void setPro_fa_location(String pro_fa_location) {
		this.pro_fa_location = pro_fa_location;
	}
	public int getTotalproduction_perday() {
		return totalproduction_perday;
	}
	public void setTotalproduction_perday(int totalproduction_perday) {
		this.totalproduction_perday = totalproduction_perday;
	}
	public String[] getItemnames() {
		return itemnames;
	}
	public void setItemnames(String[] itemnames) {
		this.itemnames = itemnames;
	}
	public LocalDate getProd_date() {
		return prod_date;
	}
	public void setProd_date(LocalDate prod_date) {
		this.prod_date = prod_date;
	}
	@Override
	public String toString() {
		return "ProductionFacility [pliid=" + pliid + ", pro_facility_name=" + pro_facility_name + ", pro_fa_location="
				+ pro_fa_location + ", totalproduction_perday=" + totalproduction_perday + ", itemnames="
				+ Arrays.toString(itemnames) + ", prod_date=" + prod_date + "]";
	}
	 
	
}
class Demo{
	public static void main(String[] args) {
		
		List<ProductionFacility> list  = new ArrayList<>();
		
		String itemnames1= "sugar";

		String itemnames2= "coffee";
		String itemnames3= {"tea" ,"milk","pepsi"};
		
		String itemnames[]= {itemnames1,itemnames2,  itemnames3};
		LocalDate date1 = LocalDate.of(2017, 1, 13);  
		LocalDate date2 = LocalDate.of(2017, 1, 12);  
		LocalDate date3 = LocalDate.of(2017, 1, 14);  
		LocalDate ld[]= {date1,date2,date3};
		
		
		int totalprod1[]= {1000,2000,1300};
		int totalprod2[]= {2000,3100,1300};
		int totalprod3[]= {1200,3300,760};
		int sum1=0,sum2=0,sum3=0;
		int avg1,avg2,avg3;
		
		
		for(int i=0;i<3;i++) 
		{
		//ProductionFacility pf1 = new ProductionFacility(1, "facname1", "indore", totalprod1[i], itemnames, ld[i]);
		//ProductionFacility pf2 = new ProductionFacility(1, "facname1", "indore", totalprod2[i], itemnames, ld[i]);
		//ProductionFacility pf3 = new ProductionFacility(1, "facname1", "indore", totalprod3[i], itemnames, ld[i]);
		//System.out.println(pf1);
		sum1=sum1+totalprod1[i];
		sum2=sum2+totalprod2[i];
		sum3=sum3+totalprod3[i];
		if(i==2) {
			 avg1=sum1/3;
			 avg2=sum2/3;
			 avg3=sum3/3;
			 System.out.println(avg1);
			 System.out.println(avg2);
			 System.out.println(avg3);
		
		
		ProductionFacility pf1 = new ProductionFacility(1, "facname1", "indore", avg1, itemnames1[i], ld[i]);
		ProductionFacility pf2 = new ProductionFacility(2, "facname2", "bhopal", avg2, itemnames2[i], ld[i]);
		ProductionFacility pf3 = new ProductionFacility(3, "facname3", "sehore", avg3, itemnames3[i], ld[i]);
		list.add(pf1);
		list.add(pf2);
		list.add(pf3);
		}
		}
		Comparator<ProductionFacility> comparator1 = Comparator.comparing( ProductionFacility:: getTotalproduction_perday);
		ProductionFacility highest = list.stream().max(comparator1).get();
		System.out.println(highest);
		
		System.out.println(" detail of facility on the basis of name");
		
		Comparator<ProductionFacility> comparator2 = Comparator.comparing( ProductionFacility:: getPro_facility_name);
		
		List<String> names = list.stream().map(s->s.getPro_facility_name()+" "+s.getPliid()+" "+
		s.getPro_fa_location()+" "+" "+s.getTotalproduction_perday()+" "+s.getItemnames()+" "+s.getProd_date()).collect(Collectors.toList());
		
		
		List<String> names1 = list.stream().map(s->s.toString()).collect(Collectors.toList());
		System.out.println(names1);
		
		
		
	}
}
 

