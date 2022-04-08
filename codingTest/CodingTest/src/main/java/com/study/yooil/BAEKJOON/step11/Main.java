package com.study.yooil.BAEKJOON.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		// 1. 수 정렬하기(삽입정렬 이용)
//		int N = 0;
//		int temp = 0;
//		
//		N = Integer.parseInt(br.readLine());
//		
//		int[] arr = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//
//		for(int i = 1; i < N; i++) {
//			temp = arr[i];
//			for(int j = i - 1; j >= 0; j--) {
//				if(temp < arr[j]) {
//					arr[j+1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
//		// 2. 수 정렬하기 2
//		int N = 0;
//		StringBuilder sb = new StringBuilder();
//		
//		N = Integer.parseInt(br.readLine());
//		
//		List<Integer> arr = new ArrayList<>();
//		
//		for(int i = 0; i < N; i++) {
//			arr.add(Integer.parseInt(br.readLine())); 
//		}
//		
//		Collections.sort(arr);
//		
//		for(int value : arr) {
//			sb.append(value).append('\n');
//		}
//		System.out.println(sb);
		
//		// 3. 수 정렬하기 3 (counting sort)
//		int N = 0;
//		StringBuilder sb = new StringBuilder();
//		
//		N = Integer.parseInt(br.readLine());
//		
//		int[] count = new int[10001];
//		
//		for(int i = 0; i < N; i++) {
//			count[Integer.parseInt(br.readLine())]++;
//		}
//		
//		for(int i = 0; i < count.length; i++) {
//			while(count[i] > 0) {
//				sb.append(i).append('\n');
//				count[i]--;
//			}
//		}
//		
//		System.out.println(sb);
		
		// 4. 통계학
		int N = 0;
		double sum = 0;
		int temp = 0;
		int cnt = 0;
		int median = 0;
		int max = 0;
		int maxValue = 0;
		int maxTemp = 0;
		int s = Integer.MAX_VALUE;
		int e = Integer.MIN_VALUE;
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		int[] count = new int[8001];
		
		// 합산 및 count
		for(int i = 0; i < N; i++) {
			temp = Integer.parseInt(br.readLine());
			
			sum += temp;
			
			count[temp + 4000]++;
			
			if(temp > e) {
				e = temp;
			}
			
			if(temp < s) {
				s = temp;
			}
			
			
		}
		
		// 최빈값, 중앙값, 범위 찾기
		for(int i = 0; i < count.length; i++) {
			if(count[i] > 0) {
				cnt += count[i];
			}
			
			if(cnt >= N/2 +1) {
				median = i - 4000;
				break;
			}
		}
		
		// 최빈값 찾기
		for(int i = 0; i < count.length; i++) {
			if(count[i] > max) {
				max = count[i];
				maxValue = i - 4000;
			}
		}
		
		cnt = 0;
		
		// 최빈값이 여러개일 때
		for(int i = 0; i < count.length; i++) {
			if(count[i] == max) {
				cnt++;
			}
			
			if(cnt == 2) {
				maxTemp = i - 4000;
				break;
			}
		}
		
		cnt = 0;
		
		for(int i = 0; i < count.length; i++) {
			
			if(count[i] == max) {
				cnt++;
			}
			
			if(cnt > 1) {
				maxValue = maxTemp;
				break;
			}
		}
		
		// 산술평균
		sb.append(Math.round(sum/N)).append('\n');
		// 중앙값
		sb.append(median).append('\n');
		// 최빈값
		sb.append(maxValue).append('\n');
		// 범위
		sb.append(e-s).append('\n');
		
		
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
