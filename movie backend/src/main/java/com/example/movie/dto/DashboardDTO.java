package com.hexaware.cinemax.dto;

public class DashboardDTO {
    private String totalUsers;
    private String totalShows;
    private String totalSales;

    public DashboardDTO() {
        // Default constructor
    }

    public DashboardDTO(String totalUsers, String totalShows, String totalSales) {
        this.totalUsers = totalUsers;
        this.totalShows = totalShows;
        this.totalSales = totalSales;
    }

	public String getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(String totalUsers) {
		this.totalUsers = totalUsers;
	}

	public String getTotalShows() {
		return totalShows;
	}

	public void setTotalShows(String totalShows) {
		this.totalShows = totalShows;
	}

	public String getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(String totalSales) {
		this.totalSales = totalSales;
	}

}
