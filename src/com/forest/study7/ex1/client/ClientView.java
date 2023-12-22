package com.forest.study7.ex1.client;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class ClientView {

	public ArrayList<ClientDTO> ClientDAO(String s) {
		ArrayList<ClientDTO> al = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(s, "-");
		while(st.hasMoreTokens()) {
			ClientDTO weatherDTO = new ClientDTO();
			weatherDTO.setCity(st.nextToken());
			weatherDTO.setTemp(Integer.parseInt(st.nextToken()));
			weatherDTO.setInfo(st.nextToken());
			weatherDTO.setHum(Integer.parseInt(st.nextToken()));
			al.add(weatherDTO);
		}
		return al;
	}
		public void view(ArrayList<ClientDTO> al) {
			System.out.println("도시명\t기온\t날씨\t습도");
			for(ClientDTO wD:al) {
				System.out.print(wD.getCity()+"\t");
				System.out.print(wD.getTemp()+"\t");
				System.out.print(wD.getInfo()+"\t");
				System.out.println(wD.getHum()+"%");
			}			
			System.out.println("====================================");	
		}
}
