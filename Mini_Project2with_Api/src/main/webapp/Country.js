/**
 * 
 */
 function submit(){
	var countryName=document.getElementById("countryName").value;
	var xhr=new XMLHttpRequest();
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4 && xhr.status==200){
			var respobj=JSON.parse(xhr.responseText);
			Name.innerText=respobj[0].name;
			Capital.innerText=respobj[0].capital;
			AgriCulture.innerText=respobj[0].employment_agriculture;
			industry.innerText=respobj[0].employment_industry;
			service.innerText=respobj[0].employment_services;
			region.innerText=respobj[0].region;
			SexRatio.innerText=respobj[0].sex_ratio;
			surfaceArea.innerText=respobj[0].surface_area;
			lifeMale.innerText=respobj[0].life_expectancy_male;
			lifeFemale.innerText=respobj[0].life_expectancy_female;
			Currency.innerText=respobj[0].currency.name;
			CountryCode.innerText=respobj[0].currency.code;
			population.innerText=respobj[0].population;
			Tourist.innerText=respobj[0].tourists;
			UrbanPopulation.innerText=respobj[0].urban_population;
			console.log(respobj[0])
			console.log(Name,Capital,AgriCulture,industry,service,region,SexRatio,surfaceArea,lifeMale,Currency,CountryCode,population);
			
		}
	}
	xhr.open("POST","./CountryServlet");
	xhr.setRequestHeader("COntent-Type","application/x-www-form-urlencoded");
	xhr.send("CountryName="+countryName);
}