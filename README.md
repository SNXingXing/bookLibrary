# bookLibrary
书籍管理
    为了避免数据库中字段重复冗余,把我书籍信息的字段拆分成了多张表,用一张中间表来进行关联,来形成一张书籍信息的表.
	几张表的主键都自增的
	book_name为书籍名字的表,有2个字段,一个是主键n_id,一个是名字b_name
	book_author为作者表,有2个字段,一个是主键a_id,一个是作者名a_name
	book_publisher为出版社表,有2个字段,一个是主键p_id,一个是出版社p_name
	book_category为分类表,有2个字段,一个是主键c_id,一个是分类名c_name
	book_isbn为书籍信息表,有9个字段,分别是主键isbn_id,isbn号 isbn,出版时间 publishTIme,版次 edition,库存num和上面4个表的关联字段.
	
	book_PurchaseBatch为购买批次表,3个字段 主键pb_id,购买时间pb_time,备注notes
	book_store为库存表,有4个字段,主键s_id,购买批次关联pb_id,书籍isbn关联 isbn_id,书籍状态s_state
	
	