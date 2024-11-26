package Antes_e_Depois;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Antes_e_Depois {
	
	@BeforeEach
	public void before() {
		System.out.println("@Before");
		}
	
	@AfterEach
	public void after() {
		System.out.println("@after");
		}
	
	@BeforeAll
	static public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	@AfterAll
	static public void afterClass() {
		System.out.println("@AfterClass");
	}
	@Test
	public void test1() {
		System.out.println("Teste 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Teste 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Teste 3");
	}

}
