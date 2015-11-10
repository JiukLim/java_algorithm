package tmonTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static HashMap<String, Product> initProduct(){
		HashMap<String, Product> productMap = new HashMap<String, Product>();
		Product gamingPc = new Product("H", 900000, "고급 게이밍 PC", "고사양 고급 PC");
		Product middlePc = new Product("M", 550000, "중급 게이밍 PC", "가격대 성능비 좋은 PC");
		Product lowerPc = new Product("L", 350000, "알뜰 PC", "최소 구동 환경 제공");
		productMap.put("H", gamingPc);
		productMap.put("M", middlePc);
		productMap.put("L", lowerPc);
		return productMap;
	}
	
	public static HashMap<String, Option> initOption(){
		HashMap<String, Option> optionMap = new HashMap<String, Option>();
		Option window = new Option("W", 120000, "윈도우", "윈도우 사전 설치");
		Option noassembly = new Option("NA", -50000, "조립안함", "가격 인하");
		Option quicktrasfer = new Option("Q", 20000, "빠른 배송", "퀵 서비스를 이용한 배송");
		Option insurance = new Option("A", 3, "보험", "옵션 제외 기본 상품값의 3%, 항상 옵션의 제일 처음에 나옴");	// 처음에 등장
		optionMap.put("W", window);
		optionMap.put("NA", noassembly);
		optionMap.put("Q", quicktrasfer);
		optionMap.put("A", insurance);
		return optionMap;
	}
	
	public static Order MakeOrder(String inputData, HashMap<String, Product> productMap, HashMap<String, Option> optionMap){
		final int ORDER_ID = 0;
		final int USER_ID = 1;
		final int PRODUCT_CODE = 2;
		final int OPTION_FIRST_CODE = 3;
		
		List<Option> optionList = new ArrayList<Option>();
		String orderData[] = inputData.split(",");
		for(int i = OPTION_FIRST_CODE;i < orderData.length;i++){
			optionList.add(optionMap.get(orderData[i]));
		}
		Order order = new Order(orderData[ORDER_ID], orderData[USER_ID], productMap.get(orderData[PRODUCT_CODE]), optionList);
		return order;
	}
	
	public static List<Order> ordering(HashMap<String, Product> productMap, HashMap<String, Option> optionMap){
		List<Order> orderList = new ArrayList<Order>();
		try {
			File aFile = new File("./src/testcase.txt");
			FileReader fileReader = new FileReader(aFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			while((line = reader.readLine()) != null){
				System.out.println(line);
				orderList.add(MakeOrder(line, productMap, optionMap));
			}
			reader.close();
		} catch (Exception e) {
		}
		return orderList;
	}
	
	public static void findAll(List<Order> orderList){
		for(int i = 0;i<orderList.size();i++){
			Order current = orderList.get(i);
			// System.out.println(current.getProduct().getName() + " - " + current.getProduct().getPrice() + " - " + current.getProduct().getDescription());
		}
	}
	
	public static int findSumByOrderId(List<Order> orderList, String orderId){
		int sum = 0;
		for(int i = 0;i<orderList.size();i++){
			Order current = orderList.get(i);
			Product product = current.getProduct();
			List<Option> option = orderList.get(i).getOptionList();
			if(current.getOrderId().equals(orderId)){
				sum += calculateOrderPrice(product, option);
			}
		}
		return sum;
	}
	
	// 출력(특정 사용자아이디에 대한 주문 목록 가격과 그 총 합) findAllByUserId
	public static int findAllByUserId(List<Order> orderList, String userId){
		int sum = 0;
		for(int i = 0;i<orderList.size();i++){
			Order currentOrder = orderList.get(i);
			Product product = currentOrder.getProduct();
			List<Option> option = orderList.get(i).getOptionList();
			if(currentOrder.getUserId().equals(userId)){
				sum += calculateOrderPrice(product, option);
			}
		}
		return sum;
	}
	
	// 주문에 대한 가격 계산
	public static int calculateOrderPrice(Product product, List<Option> optionlist){
		int productprice = product.getPrice();
		for(int i = 0;i<optionlist.size();i++){
			Option currentOption = optionlist.get(i);
			if(i == 0 && currentOption.getCode().equals("A")){
				productprice *= currentOption.getPrice();
			}
			else{
				productprice += currentOption.getPrice();
			}
		}
		return productprice;
	}
	
	public static void main(String[] args) {
		HashMap<String, Product> productmap = initProduct();
		HashMap<String, Option> optionmap = initOption();
		List<Order> orderlist = ordering(productmap, optionmap);
		findAll(orderlist);
		System.out.println(findSumByOrderId(orderlist, "123456"));
		System.out.println(findAllByUserId(orderlist, "tmon"));
	}
}
