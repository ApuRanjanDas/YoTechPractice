package com.example.yotechpractice.api_roomdb_mvvm.model

import com.google.gson.annotations.SerializedName

data class ApiModel(

	@field:SerializedName("ApiModel")
	val apiModel: List<ApiModelItem?>? = null
)

data class ApiModelItem(

	@field:SerializedName("data")							//https://api.restful-api.dev/objects
	val data: Data? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)

data class Data(

	@field:SerializedName("Generation")
	val generation: String? = null,

	@field:SerializedName("Price")
	val price: String? = null,

	@field:SerializedName("Capacity")
	val capacity: String? = null,

	@field:SerializedName("Screen size")
	val screenSize: Any? = null,

	@field:SerializedName("Description")
	val description: String? = null,

	@field:SerializedName("Color")
	val color: String? = null,

	@field:SerializedName("Strap Colour")
	val strapColour: String? = null,

	@field:SerializedName("Case Size")
	val caseSize: String? = null,

	@field:SerializedName("year")
	val year: Int? = null,

	@field:SerializedName("price")
	val price: Any? = null,

	@field:SerializedName("CPU model")
	val cPUModel: String? = null,

	@field:SerializedName("Hard disk size")
	val hardDiskSize: String? = null,

	@field:SerializedName("generation")
	val generation: String? = null,

	@field:SerializedName("color")
	val color: String? = null,

	@field:SerializedName("capacity GB")
	val capacityGB: Int? = null,

	@field:SerializedName("capacity")
	val capacity: String? = null
)
